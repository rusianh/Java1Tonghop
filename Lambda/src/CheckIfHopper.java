/**
 * 
 */

/**
 * @note [Lambda]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 31, 2021 (9:15:03 PM)
 * @version 1.0
 */
public class CheckIfHopper implements CheckTrait {

	public CheckIfHopper() {
		
	}

	@Override
	public boolean test(Animal a) {
		return a.canHop();
	}

}
