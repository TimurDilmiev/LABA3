public class Main {
    public static void main(String[] args) {


        PeopleMOVES Neznayka = new PeopleMOVES("Незнайка" , Gender.MALE);
        PeopleMOVES mudila = new PeopleMOVES("Сотрудник конторы" , Gender.MALE);
        PeopleMOVES dura = new PeopleMOVES("госпожа Минога" , Gender.FEMALE);

        ObjectsACLASS dogs = new ObjectsACLASS("обеих собак");
        ObjectsACLASS name = new ObjectsACLASS("имя");
        ObjectsACLASS adress = new ObjectsACLASS("адрес");
        ObjectsACLASS service = new ObjectsACLASS("услуги конторы фертинг;");
        ObjectsACLASS hozyaika = new ObjectsACLASS("хозяйки");
        ObjectsACLASS Neznayki = new ObjectsACLASS("незнайки");
        ObjectsACLASS money = new ObjectsACLASS("жалованье");
        ObjectsACLASS forms = new ObjectsACLASS("формальности");
        ObjectsACLASS dura1 = new ObjectsACLASS("госпожи Миноги");
        ObjectsACLASS withbitch = new ObjectsACLASS(" со служанкой.");

        System.out.print(Neznayka.sit() + " " + Neznayka.and() + Neznayka.caress(dogs));
        System.out.println(mudila.write(name) + Neznayki.name + ", " + mudila.then() + " ");
        System.out.print(adress.name + " " + dura.and() + name.name + " " + hozyaika.name);
        System.out.println(dura.whoNamed() + ","); System.out.print(Neznayka.afterThat() + " "); System.out.print(mudila.say1() + ",");
        System.out.print(Neznayka.mustPay() + " "); System.out.println(service.name); System.out.println(Neznayka.ifCant());
        System.out.print(Neznayka.receive(money)); System.out.println(" " + Neznayka.onThis(forms));
        System.out.println(Neznayka.and() + Neznayka.deleted() + Neznayka.together(dogs) + ",");
        System.out.println(dura.then() + " " + dura1.name + withbitch.name);
    }
}