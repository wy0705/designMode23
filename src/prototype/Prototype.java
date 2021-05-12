package prototype;

//原型模式
//定义：通过复制现有实例来创建新的实例，无需知道相应类的信息。
//
//简单地理解，其实就是当需要创建一个指定的对象时，我们刚好有一个这样的对象，但是又不能直接使用，我会clone一个一毛一样的新对象来使用；基本上这就是原型模式。关键字：Clone。
//
// 深拷贝和浅拷贝
//浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
//
//深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。clone明显是深复制，clone出来的对象是是不能去影响原型对象的

//举例（银行发送大量邮件，使用clone和不使用clone的时间对比）：我们模拟创建一个对象需要耗
// 费比较长的时间，因此，在构造函数中我们让当前线程sleep一会
public class Prototype {
    /*public Mail(EventTemplate et) {
        this.tail = et.geteventContent();
        this.subject = et.geteventSubject();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }*/
}

//不使用克隆
/*
public static void main(String[] args) {
    int i = 0;
    int MAX_COUNT = 10;
    EventTemplate et = new EventTemplate("9月份信用卡账单", "国庆抽奖活动...");
    long start = System.currentTimeMillis();
    while (i < MAX_COUNT) {
        // 以下是每封邮件不同的地方
        Mail mail = new Mail(et);
        mail.setContent(getRandString(5) + ",先生（女士）:你的信用卡账单..." + mail.getTail());
        mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
        // 然后发送邮件
        sendMail(mail);
        i++;
    }
    long end = System.currentTimeMillis();
    System.out.println("用时:" + (end - start));
}*/

//使用克隆
/*public static void main(String[] args) {
    int i = 0;
    int MAX_COUNT = 10;
    EventTemplate et = new EventTemplate("9月份信用卡账单", "国庆抽奖活动...");
    long start=System.currentTimeMillis();
    Mail mail = new Mail(et);
    while (i < MAX_COUNT) {
        Mail cloneMail = mail.clone();
        mail.setContent(getRandString(5) + ",先生（女士）:你的信用卡账单..."
                + mail.getTail());
        mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
        sendMail(cloneMail);
        i++;
    }
    long end=System.currentTimeMillis();
    System.out.println("用时:"+(end-start));
}*/
