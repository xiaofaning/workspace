/**2）创建主类：
 创建一个对象：名叫“张三”，性别“男”，年龄18岁，身高1.80；
 让该对象调用成员方法：
 说出“你好！”
 计算23+45的值
 将名字改为“李四”
 * Created by zhangxiaofan on 2016/12/4.
 */
public class A {
   public static void main(String args[]){
        People wode=new People("张三","男",18,1.80f);
    }
    wode.speak("你好");
    wode.add(23,45);
    wode.gaiming("lisi");


}
