package tr.com.ckama;

public class Q19 {

	public static void main(String[] args) {
		Link link1 = new Link("x", null);
		Link link2 = new Link("y", link1);
		Link link3 = new Link("z", link2);

		link2.setNext(link3);
		link3.setNext(link2);
		link1 = null;
		link3 = null;
	}

}

class Link {
	private String name;
	private Link next;

	public Link(String name, Link next) {
		this.name = name;
		this.next = next;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

}
