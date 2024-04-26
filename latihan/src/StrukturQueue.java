
//latihan 1 dan latihan 2

public class StrukturQueue {

  //deklarasi
  private Node FRONT;
  private Node REAR;


 // Function untuk memeriksa apakah antrian kosong.
public boolean isEmpty() {
  return FRONT == null;
}

// Function untuk menambahkan elemen baru ke dalam antrian.
public void enqueue(int data) {
  Node newNode = new Node(data);
  if (isEmpty()) {
      FRONT = newNode;
      REAR = newNode;
  } else {
      REAR.setNext(newNode);
      REAR = newNode;
  }
}







//latihan 3
// Function untuk menghitung jumlah elemen dalam antrian.
public int size() {
  int size = 0;
  Node curNode = FRONT;
  while (curNode != null) {
      size++;
      curNode = curNode.getNext();
  }
  return size;
}

// Function untuk mengambil nilai dari elemen terdepan antrian tanpa menghapusnya.
public int front() {
  return FRONT != null ? FRONT.getData() : -1; // Mengembalikan -1 jika antrian kosong.
}

//latihan 5

// Function untuk menampilkan elemen-elemen dalam antrian.
public void displayElement() {
  Node curNode = FRONT;
  if (FRONT == null) {
    System.out.println("queue kosong");
  }
  while (curNode != null) {
    System.out.print(curNode.getData() + " "); // Menampilkan elemen dengan satu spasi di antara setiap elemen.
    curNode = curNode.getNext();
  }
}


//tugas

// Function untuk menghapus elemen dari depan antrian.
public void dequeue() {
  Node temp = FRONT;
  if (FRONT != null) {
    if (FRONT == REAR) {
      FRONT = null;
      REAR = null;
    } else {
      temp = FRONT;
      FRONT = FRONT.getNext();
      dispose(temp); // Menghapus node yang telah dikeluarkan dari antrian.
    }
  }
}

// Function untuk membebaskan memori yang dialokasikan untuk node yang tidak digunakan.
private void dispose(Node temp) {
  temp.setNext(null);
  temp = null;
}

}