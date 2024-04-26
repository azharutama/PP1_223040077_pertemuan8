public class queueMain {
  public static void main(String[] args) {
    StrukturQueue myList = new StrukturQueue();
    StrukturQueue myList2 = new StrukturQueue();
    StrukturQueue myList3 = new StrukturQueue();


    ////main latihan 4

    System.out.println("----sebelum di isi 3x ------");

    System.out.println("is empty =" + myList.isEmpty());
    System.out.println("size = " + myList.size());
    myList.displayElement();

    System.out.println();

    System.out.println("-----sudah di isi 3x -------");
    myList.enqueue(1);
    myList.enqueue(2);
    myList.enqueue(3);
    System.out.println("is empty =" + myList.isEmpty());
    System.out.println("size = " + myList.size());
    System.out.println("front = " + myList.front());

    System.out.println();


    ///latihan 5

    System.out.println("----sebelum di isi 4x ------");

    System.out.println("is empty =" + myList2.isEmpty());
    System.out.println("size = " + myList2.size());
    myList2.displayElement();

    System.out.println();

    System.out.println("-----sudah di isi 4x -------");
    myList2.enqueue(1);
    myList2.enqueue(2);
    myList2.enqueue(3);
    myList2.enqueue(4);
    System.out.println("is empty =" + myList2.isEmpty());
    System.out.println("size = " + myList2.size());
    System.out.println("front = " + myList2.front());
    myList2.displayElement();
    System.out.println();


    ///tugas

    System.out.println("----sebelum di isi 5x ------");

    System.out.println("is empty =" + myList3.isEmpty());
    System.out.println("size = " + myList3.size());
    myList3.displayElement();

    System.out.println();

    System.out.println("-----sudah di isi 5x -------");
    myList3.enqueue(1);
    myList3.enqueue(2);
    myList3.enqueue(3);
    myList3.enqueue(4);
    myList3.enqueue(5);
    System.out.println("is empty =" + myList3.isEmpty());
    System.out.println("size = " + myList3.size());
    System.out.println("front = " + myList3.front());
    myList3.displayElement();
    myList3.dequeue();
    System.out.println();
    myList2.displayElement();



    
  
    ;




    
  }

  

  
  

}
