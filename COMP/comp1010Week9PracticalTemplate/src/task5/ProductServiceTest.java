package task5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import core.Node;

public class ProductServiceTest {
    @Test
    public void testProduct() {
        Node d = new Node(1, null);
        Node c = new Node(7, d);
        Node b = new Node(2, c);
        Node a = new Node(9, b);
        
        assertEquals(126, ProductService.product(a));
        assertEquals(14, ProductService.product(a.next));
        assertEquals(14, ProductService.product(b));
        assertEquals(7, ProductService.product(c));
        assertEquals(1, ProductService.product(d));
        assertEquals(1, ProductService.product(null));
    }
}
