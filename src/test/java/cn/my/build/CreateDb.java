package cn.my.build;

import org.cn.oxo.e.commerce.padd.clent.service.pojo.PddCrawlerProxyBean;

import cn.zy.dev.tools.build.base.IBuildService;
import cn.zy.dev.tools.build.base.MyBatisBuildServiceException;
import cn.zy.dev.tools.build.db.DBUtils;
import cn.zy.dev.tools.build.db.MariadbDBUtils;
import cn.zy.dev.tools.build.html.CreateHtml;
import cn.zy.dev.tools.build.mybatis.MyBatisBuildService;

public class CreateDb {

	public static void main(String[] args) throws Exception
    {

        String basePath = "org.cn.oxo.e.commerce.padd.clent";

        String outPath = "d:\\tmp";

        String url = "jdbc:mysql://localhost:3306/hs_isc_test";
        String username = "root";
        String password = "123456";

        IBuildService iIBuildService = new MyBatisBuildService(basePath, false);

        DBUtils iMYSQLDBUtils = new MariadbDBUtils(url, username, password);

        iIBuildService.build(PddCrawlerProxyBean.class, outPath, true, null);;
        
        CreateHtml iCreateHtml=new CreateHtml();
        
        iCreateHtml.create(PddCrawlerProxyBean.class, outPath);
        
        
        //iIBuildService.build(ShiroRolePowerBean.class, outPath, true, iMYSQLDBUtils);;

      

    }

}
