package cn.dbdj1201.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author: yz1201
 * @Date: 2021/7/19 11:04
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TestBody {

    private String name;
    private Integer age;

//    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

}
