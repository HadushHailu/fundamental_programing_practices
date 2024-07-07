package simple_formal_project_8;

import java.util.*;

public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    Marketing(String employeeName,
              String productName,
              double salesAmount){
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Marketing marketing = (Marketing) object;
        return  salesAmount == marketing.salesAmount &&
                Objects.equals(employeeName, marketing.employeeName) &&
                Objects.equals(productName, marketing.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, productName, salesAmount);
    }

    public String toString(){
        return "(Employee Name: " + employeeName +
                ", Product Name: " + productName +
                ", Sales Amount: "  + salesAmount + ")\n";
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list){
//        for(Marketing marketing: list){
//            if(marketing.salesAmount <= 1000){
//                list.remove(marketing);
//            }
//        }

        Iterator<Marketing> marketingIterator;

        for(marketingIterator = list.iterator(); marketingIterator.hasNext(); ){
            if(marketingIterator.next().salesAmount <= 1000){
                marketingIterator.remove();
            }
        }
        return list;
    }
    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();
        //Add objects using add() method
        marketingList.add(new Marketing("PersonAA", "ProductAA", 1000));
        marketingList.add(new Marketing("EmployeeJJ", "ProductBB", 1500.98));
        marketingList.add(new Marketing("EmployeeCC", "ProductCC", 7000.98));
        marketingList.add(new Marketing("EmployeeDD", "ProductDD", 400.98));

        System.out.println("\n[+] All elements.");
        System.out.println(marketingList);

        // print out the size method
        System.out.println("\nsize of list: " + marketingList.size());

        //Remove element
        System.out.println("\n[+] After removing.");
        System.out.println(marketingList.remove(new Marketing("PersonAA", "ProductAA", 1000)));
        System.out.println(marketingList);

        //sort based on sales amount
        marketingList.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return (int) (o1.salesAmount - o2.salesAmount);
            }
        });

        System.out.println("\n[+] After sorting.");
        System.out.println(marketingList);

//        Sort the list in natural order using employeename with the criteria of the
//        employee who achieves more than $1000 of salesamount. Write a method
//        to retrieve the result of getting list of employees have more than $1000
//        sales. Then do the sorting on this result list.

        System.out.println("\n[+] Sorting based on EmployeeName for sales amount > 100");
        Marketing.listMoreThan1000(marketingList).sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return o1.employeeName.compareTo(o2.employeeName);
            }
        });
        System.out.println(marketingList);
    }
}
