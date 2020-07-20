/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import hao.util.MathUtil;
import static junit.framework.Assert.*;
import org.junit.Test;

/**
 *
 * @author nnhao
 */
public class MathUtilTest {

    public MathUtilTest() {
        // đây là 1 class đặc biệt, mà mỗi hàm dùng để test các hàm bên các class cũ của dự án, ví dụ test hàm cF() côi chạy đúng ko
        // mỗi hàm sẽ chạy 1 hoặc nhiều lệnhcF() tùy bạn, để kiểm tra coi
        // actual có khớp vs expected hay ko
        // khớp, ném ra màu xanh
        // không khớp, màu đỏ
        // mỡi hàm sẽ là 2 hàm main() nếu nó mang phía trước mợt kí hiệu
        //@Test - gọi là annotation

    }

    @Test
    public void testSuccessfulCase() {
        // hàm nầy gọi những cF() mà trả về
        //        assertEquals(120, 720);
        
        // expected: 1, actual: cho tinh toan
        assertEquals(1, MathUtil.computeFactorial(1));
        
        // expected: 1, actual: cho tinh toan
        assertEquals(1, MathUtil.computeFactorial(0));        
        
        assertEquals(2, MathUtil.computeFactorial(2));        
        
        assertEquals(6, MathUtil.computeFactorial(3));
        
        assertEquals(720, MathUtil.computeFactorial(6));        
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFailCase(){
        // hàm nầy test những tình huốn cả nhóm
        // người dùng đưa 5!, tính thế éo nào đc
        // cF() pahỉ ném về ngoại lệ, một tình huống bất thương,
        // một exception ko pahỉ là value để assert()
        // ta phải dùng 1 chiêu khác
        
        MathUtil.computeFactorial(-5); //ko xài assertEquals
        // đưa -5 vào tham số, mình (dev tk ra hàm cF() coi đây là cà chớn
        //đập vào mặt người đưa con số -5 nầy vào
        // bằng cách ném ra ngoại lệ IllegalArgumentException
    }
    

}
// chỉ cần 1 thằng đỏ, là coi như cả đám đỏ, hàm chạy đúng hầu hết
// các cases, nhưng chỉ 1 tình huống sai, coi như hàm sai
// xanh: tất cả các hàm đúng vs mọi trường hợp
