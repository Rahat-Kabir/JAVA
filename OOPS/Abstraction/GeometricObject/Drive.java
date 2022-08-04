
public class Drive {

	public static void main(String[] args) {
		GeometricObject geoObject1 = new Circle(8.0);
		System.out.println(geoObject1.toString());
		System.out.println();
		GeometricObject geoObject2 = new Rectangle(4.0, 5.0);
		System.out.println(geoObject2.toString());
		System.out.println();
		System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

	}

	public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
		return object1.getArea() == object2.getArea();
	}

}
