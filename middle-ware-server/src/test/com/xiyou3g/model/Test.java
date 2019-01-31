package com.xiyou3g.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author zengshuaizhi@baidu.com
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test {
    private String userName;

    private Integer articleId;

    private String password;

    private String desc;

    public String toString() {
        return new StringBuilder()
                .append("{\"userName\":\"")
                .append(userName)
                .append("\",\"articleId\":")
                .append(articleId)
                .append("}")
                .toString();

//        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).toString();
    }

    public static void main(String[] args) {
        System.out.println(new Test("gaoshaochen", 1, "123", "test").toString());
    }
}
