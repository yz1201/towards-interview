package cn.dbdj1201.interview.test.difficult;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: yz1201
 * @Date: 2023/10/27 10:20
 */
@Slf4j
public class T10 {

    public static void main(String[] args) {
//        System.out.println(Pattern.compile(".a*").matcher("aaaaa").matches());
        String phones1 = "MKY 的手机号码：0939-100391"
                +"XL 的手机号码：0939-666888aaaa"
                +"LJ 的手机号码：0952-600391"
                +"XQZ 的手机号码：0939-550391";;
        String regex = ".*0939-\\d{6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phones1);

        while(matcher.find()) {
            System.out.println(matcher.group()+"&&&&&");
            System.out.println("start: " + matcher.start());
            System.out.println("end: " + matcher.end());
        }// 仅仅返回一个结果的,返回最长的结果，而不是一截一截的

        String phones2 = "LJ 的手机号码：0952-600391\r\n"
                +"XQZ 的手机号码：0939-550391";
        //重用pattern
        matcher = pattern.matcher(phones2);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
        // 另外一个pattern
        String text = "abcdebcadxbc";
        regex = ".bc";
        Pattern pattern2 = Pattern.compile(regex);
        matcher = pattern2.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group()+"****");
            System.out.println("start: " + matcher.start());
            System.out.println("end: " + matcher.end());
        }// 返回结果的是多个的
        System.out.println("*************");
        // 下面是两个非常重要的
        pattern = Pattern.compile("<.+?>", Pattern.DOTALL);
        matcher = pattern.matcher("<a href=\"index.html\">主页</a>");
        String string = matcher.replaceAll("");
        System.out.println(string);

        pattern = Pattern.compile("href=\"(.+?)\"");
        matcher = pattern.matcher("<a href=\"index.html\">主页</a>");
        if(matcher.find())
            System.out.println(matcher.group(1));

    }
}
