package com.homework;

/**
 * Created by pc on 2016/1/3.
 */
public class Ui {
    /**
     * 显示注册界面
     */
    public void showAddMenu() {
        System.out.println("***************************************************************************");
        System.out.println("                        --新用户注册--");
        System.out.println("***************************************************************************\n");
    }
    /**
     * 显示登陆界面
     */
    public void showMenu() {
        System.out.println("***************************************************************************");
        System.out.println("                      --欢迎使用 New播 智能点播平台--");
        System.out.println("***************************************************************************\n");
        System.out.println("                             1, 登陆\n");
        System.out.println("                             2，注册（送10 New 币）\n");
        System.out.println("                             3，退出\n");
        System.out.println("***************************************************************************");
        System.out.print("请选择：");
    }
    /**
     * 显示主菜单
     */
    public void showMainMenu() {
        System.out.println("********************************************************************************************************");
        System.out.println("                                     --New播 播出新生活--");
        System.out.println("********************************************************************************************************\n");
        System.out.println("1, 账户管理  2, 查询余额  3，修改密码  4, 点播  5，查看点播日志  6，注销返回主菜单  7，退出程序\n");
        System.out.println("********************************************************************************************************");
        System.out.print("请选择：");
    }

}