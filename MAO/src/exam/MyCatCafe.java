package exam;

import java.sql.Array;
import java.time.LocalDate;
import java.util.*;

public class MyCatCafe implements exam.CatCafe {
    LocalDate A;
    double balance;
    List<Cat> cat=new ArrayList();
Iterator it=cat.iterator();
List<exam.Customer> Customer=new ArrayList();
    Iterator it2=cat.iterator();
    public void BUYCAT(Cat CAT) throws exam.InsufficientBalanceException {
        if (balance>CAT.price){
            cat.add(CAT);
            balance=balance-CAT.price;
        }else {
throw new exam.InsufficientBalanceException("�������㣬�Զ��ж�����������è");
        }


    };



    public void Entertaincustomers(Customer customer) throws exam.CatNotFoundException {

        Object cAt[]= cat.toArray();
        Random random = new Random();

if (cat.size()>0){
    int shu = random.nextInt(cat.size());
    Customer.add(customer);
    cat.remove(shu);
    System.out.println(cAt[shu]);
}else throw new CatNotFoundException("ûè�˰�");


    }

    public void Closeshop(LocalDate A){
       for (int c=0;c<Customer.size();c++){
           if (Customer.get(c).time.equals(A)){
               System.out.println(Customer.get(c));
               balance +=Customer.get(c).ruanum*15;
           }
       }


        System.out.println(balance);
    };
}










