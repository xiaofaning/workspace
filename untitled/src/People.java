/**10．按要求编写Java应用程序。
 （1）创建一个叫做People的类：
 属性：姓名、年龄、性别、身高
 行为：说话、计算加法、改名
 编写能为所有属性赋值的构造方法；
 （

 * Created by zhangxiaofan on 2016/12/4.
 */
public class People {
    String name,sex;
    int age;
    float height;
    People(String mingzi,String xingbie,int nainling,float shengao){
        name=mingzi;
        sex=xingbie;
        age=nainling;
        height=shengao;
    }
    void speak(String s){
        System.out.println(s);

    }
        void add(int a,int b){
            System.out.printf("%d+%d=%d",a,b,a+b);


        }
        void gaiming(String name1){
            name=name1;
            System.out.println(name);

        }


}
