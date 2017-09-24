package com.wcc.link;

import org.omg.CORBA.Current;

public class TestLink {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		theList.displayList();
	}

	// delete(i)
	// insert(i)
	// update(i)

}

class Link {
	public int idata;
	public double dData;
	public Link next;

	public Link(int idata, double dData) {
		this.idata = idata;
		this.dData = dData;
	}

	public void displayLink() {
		System.out.println("{" + idata + "," + dData + "}");
	}
}

class LinkList {
	private Link first;

	public void Link() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	// 在表头插入一个新链接点
	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;// 被插入对象的next指向当前的头节点
		first = newLink;// 将头节点指向到当前链表对象
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.println("List-->last:");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("1111111");
	}

	public Link find(int key) {
		Link current = first;
		while (current.idata != key) {

			if (current.next == null) {
				return null;
			} else {
				current = current.next;
			}

		}

		return current;

	}

	public Link delete(int key) {
		Link current = first;
		Link previous = first;

		while (current.idata != key) {
			if (current == null)
				return null;
			else {
				previous = current;
				current = current.next;
			}
		}
		previous.next = current.next;
		return current;

	}

}
