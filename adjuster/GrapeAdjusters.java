package adjuster;

public class GrapeAdjusters {
	public static GrapeAdjuster priceAsc(boolean asc) {
		return new GrapeAdjuster() {
			@Override
			public int compare(Grape o1, Grape o2) {
				return Integer.compare(o1.price, o2.price) * (asc ? 1 : -1);
			}
		};
	}
}
