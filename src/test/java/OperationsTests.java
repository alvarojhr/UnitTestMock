/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author docente
 */
import com.mycompany.calculator.Operations;
import com.mycompany.calculator.Sum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OperationsTests {
    
    
    @Test
    void SumWhenIsEven(){
        Operations op = new Operations();
        
        op.num1 = 3;
        op.num2 = 3;
        
        Sum sumMock=mock(Sum.class);
        when(sumMock.suma(anyInt(), anyInt())).thenReturn(anyInt());
        assertEquals(true, op.sumEven());
    }
    
        @Test
    void SumWhenIsOdd(){
        Operations op = new Operations();
        
        op.num1 = 2;
        op.num2 = 3;
        
        Sum sumMock=mock(Sum.class);
        when(sumMock.suma(anyInt(), anyInt())).thenReturn(anyInt());
        assertEquals(false, op.sumEven());
    }
    
    @Test
    void SumWhenIsEvenX(){
        Operations op = new Operations();
     
        assertEquals(true, op.sumEven());
    }
    
    @Test
    void SumWhenIsOddX(){
        Operations op = new Operations();
     
        assertEquals(false, op.sumEven());
    }
}
