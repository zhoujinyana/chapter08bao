package com.zjy.ploypara;

public class PloyPara {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PloyPara ployParameter = new PloyPara();
        ployParameter.showEmpAnnual(tom);
        ployParameter.showEmpAnnual(milan);
        ployParameter.testWork(tom);

    }
       //实现获取任何员工对象的年工资，并在main方法中调用该方法 [e.getAnnual()]
        public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
        public void testWork(Employee e){
            if(e instanceof Worker) {
               ((Worker) e).work();//有向下转型操作
                  }else if(e instanceof Manager) {
            ((Manager)e).manage();
        }
    }


}



