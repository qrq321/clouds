package site.hyper.cloudsgenerator.config;

/**
 * @author: RuiQi
 * @Date: 2020/5/27 16:59
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.springframework.context.annotation.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cth
 * @date 2019/06/03
 */
@Profile("test")
public class MpGenerator {
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        String tableName = "base_channel";

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        // 生成文件的输出目录
        gc.setOutputDir(projectPath + "/src/main/java");
        // 作者
        gc.setAuthor("RuiQin");
        // 生成后打开目录
        gc.setOpen(false);
        // 设置时间类型使用哪个包下的
        gc.setDateType(DateType.ONLY_DATE);
        // 文件命名方式
       /* gc.setMapperName("Mapper");
        gc.setEntityName("Bean");
        gc.setControllerName("Controller");
        gc.setServiceName("Service");*/
        // 主键策略
        gc.setIdType(IdType.INPUT);
        //实体属性 Swagger2 注解
        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/hyperlink?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("site.hyper.common")
                .setEntity("entity")
                .setMapper("mapper")
                .setController("controller.basic")
                .setService("service");
        mpg.setPackageInfo(pc);

        //配置自定义属性注入
        InjectionConfig injectionConfig = new InjectionConfig() {
            //.vm模板中，通过${cfg.abc}获取属性
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<>();
//                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                map.put("abc", "自定义属性描述");
                this.setMap(map);
            }
        };
        mpg.setCfg(injectionConfig);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        // 使用自定义模板，不想要生成就设置为null,如果不设置null会使用默认模板
        templateConfig.setEntity("templates/entity.java");
        templateConfig.setController("templates/controller.java");
        templateConfig.setMapper("templates/mapper.java");
        templateConfig.setService("templates/service.java");
        templateConfig.setServiceImpl("templates/serviceImpl.java");
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // 使用lombok
        strategy.setEntityLombokModel(true);
        strategy.setInclude(tableName);
        strategy.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategy);
        mpg.execute();
    }

}


