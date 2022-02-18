package mockito;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.mock;

/**
 * @author lmmarise.j@gmail.com
 * @since 2022/2/18 11:29 PM
 */
public class $19_Aliases_for_behavior_driven_development {
    public static void main(String[] args) {
        Seller seller = mock(Seller.class);
        Shop shop = new Shop(seller);

        given(seller.askForBread()).willReturn(new Bread());

        //when
        Goods goods = shop.buyBread();
    }

}
