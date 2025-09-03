package ex02;

public class EBook extends Book {
	private int service_time, service_machines;

	public EBook() {}
	public EBook(String title, String author, String publisher, String sort, int service_time, int service_machines) {
		super(title, author, publisher, sort);
		this.service_time = service_time;
		this.service_machines = service_machines;
	}
	
	// getter & setter
	public int getServiceTime() {
		return service_time;
	}
	public int getServiceMachines() {
		return service_machines;
	}
	public void setServiceTime(int service_time) {
		this.service_time = service_time;
	}
	public void getServiceMachines(int service_machines) {
		this.service_machines = service_machines;
	}
	
	
	@Override
	public String toString() {
		return super.getTitle() + "\t" + super.getAuthor() + "\t\t" + super.getPublisher() + "\t\t" + super.getSort() + "\t" + service_time + "\t" + service_machines;
	}
}
