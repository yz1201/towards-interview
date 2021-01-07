package cn.dbdj1201.interview.design.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 19:17
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TroubleBuilder {

    private String name;
    private String duration;
    private LocalDateTime date;


}
