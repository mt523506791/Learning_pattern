package socket;

/**
 * @ClassName A  累不累多继承的 实例
 * @Description
 * @Author maTao
 * @Date 2019/11/12 0012 下午 16:35
 **/
 class A {

    void ppp(){
        System.out.println("A");
    }
}


class B extends A{

     @Override
     void ppp(){
         System.out.println("B");
     }
}


class C extends B{

     void ppp(){

    }

    public static void main(String[] args) {
        C c = new C();

        Class aClass =c.getClass().getSuperclass().getSuperclass();
        try {
            A a = (A) aClass.newInstance();
            a.ppp();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }

}




