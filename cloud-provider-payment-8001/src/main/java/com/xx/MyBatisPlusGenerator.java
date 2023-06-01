package com.xx;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;


public class MyBatisPlusGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:postgresql://localhost:5432/cloud_demo?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai", "postgres", "123")
                .globalConfig(builder -> {
                    builder.author("xuexuan").outputDir("~/Desktop/springcloud2022demo/cloud-provider-payment-8001/src/main/java/com/xx");
                }).dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);
                }).schema("public"))
                .packageConfig(builder -> {
                    builder.parent("com.xx")
                            .entity("domain.entity")
                            .mapper("domain.mapper")
                            .service("service")
                            .controller("api")
                            .serviceImpl("service.impl")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "./resources/mapper"));
                })
                .strategyConfig(builder -> {
                    builder.enableSchema().addInclude("user");
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
