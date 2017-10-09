package server.service;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/**
 * @author nivanov, <a href="mailto:Nikita.Ivanov@returnonintelligence.com">Ivanov Nikita</a>
 * @since 01-Oct-17
 */
@Component
public class ComputePiService {

	public BigDecimal calculatePi(long startIndex, long endIndex) {
		BigDecimal pi = new BigDecimal(0);
		System.out.println("Thread name:" + Thread.currentThread().getName() + " STARTING INDEX:" + startIndex);
		System.out.println("Thread name:" + Thread.currentThread().getName() + " END INDEX:" + endIndex);

		if (startIndex == 0) {
			startIndex++;
		}

		for(long i = startIndex; i < endIndex; i++) {
			BigDecimal iItem = new BigDecimal(4).divide(new BigDecimal(2 * i - 1), MathContext.DECIMAL64);
			if (i % 2 == 0) {
				pi = pi.subtract(iItem);
			} else {
				pi = pi.add(iItem);
			}
		}

		System.out.println("pi==" + pi);

		return pi;
	}
}
