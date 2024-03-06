package simple_formal_reflection_nested;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CompanyReflection {
    public static void main(String[] args) throws Exception {
        Company company = new Company("Veridian solution", 2400);
        Class compClass = company.getClass();

        System.out.println("Name of class with package name: " + compClass.getName());
        System.out.println("Name of class: "+ compClass.getSimpleName());

        Field[] companyFields = compClass.getDeclaredFields();
        for(Field field: companyFields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(company, "NextGen innovation");
            }
        }

        System.out.println(company.getName());

        Method[] companyMethods = compClass.getDeclaredMethods();
        for(Method method: companyMethods){
            String tName = method.getName();
            if(tName.equals("setNumOfEmployee")){
                method.setAccessible(true);
                method.invoke(company, 2500);
            }else if(tName.equals("internalRules")){
                method.setAccessible(true);
                method.invoke(null);
            }
        }
        System.out.println("Number of employee: " + company.getNumOfEmployee());

        Company company1 = new Company("Dr. Kirubel and Brother LTD", 4000);
        Company company2 = new  Company("Dr. Kirubel and Brother LTD", 4000);

        System.out.println(company1.equals(company2));
    }
}
