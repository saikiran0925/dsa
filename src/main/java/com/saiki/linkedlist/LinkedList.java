package com.saiki.linkedlist;

public class LinkedList {
  Node head;

  public LinkedList() {
    this.head = null;
  }

  public void add(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public void printList() {
    if (head == null) {
      System.out.println("This list is empty");
      return;
    }

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    Node current = head;
    while (current.next != null) {
      stringBuilder.append(current.data).append(", ");
      current = current.next;
    }
    stringBuilder.append(current.data).append(" ]");
    System.out.println(stringBuilder);
  }

  public int getSize() {
    int size = 0;

    if (head == null)
      return size;

    Node current = head;
    while (current.next != null) {
      size++;
      current = current.next;
    }
    size++;

    return size;
  }

  public void remove(int data) {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    if (head.data == data) {
      head = head.next;
      return;
    }

    Node current = head;
    while (current.next != null && current.next.data != data) {
      current = current.next;
    }

    if (current.next == null) {
      System.out.println("Element not found");
    } else {
      current.next = current.next.next;
    }
  }

  public void addByIndex(int index, int data) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("Index can't be negative");
    }

    Node newNode = new Node(data);
    if (index == 0) {
      newNode.next = head;
      head = newNode;
      return;
    }

    Node current = head;
    int currentIndex = 0;

    while (current != null && currentIndex < index - 1) {
      current = current.next;
      currentIndex++;
    }

    if (current == null) {
      throw new IndexOutOfBoundsException("Index exceeds the size of the list");
    }

    newNode.next = current.next;
    current.next = newNode;
  }

  public void removeByIndex(int index) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("Index can't be negative");
    }

    Node current = head;
    if (index == 0) {
      head = current.next;
      return;
    }

    int currentIndex = 0;
    while (current != null && currentIndex < index - 1) {
      current = current.next;
      currentIndex++;
    }

    if (current == null) {
      throw new IndexOutOfBoundsException("Index exceeds the size of the list");
    }

    current.next = current.next.next;
  }

  public int get(int index) {
    if (index < 0)
      return -1;

    if (index == 0) {
      return head.data;
    }

    Node current = head;
    int currentIndex = 0;
    while (current.next != null) {
      if (currentIndex == index)
        return current.data;
      current = current.next;
      currentIndex++;
    }
    if (currentIndex == index) {
      return current.data;
    } else {
      return -1;
    }
  }
}
