package com.zqp2sh.designpattern.抽象工厂模式.version3;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月10日 16:11
 */

public class SqlserverProject implements IProject {
    @Override
    public void insertProject(Project project) {
        System.out.println("在SQL Server中给Project表增加了一条记录");
    }

    @Override
    public Project getProject(int id) {
        System.out.println("在SQL Server中根据Id得到Project表的一条记录");
        return null;
    }
}
