package Books;

import java.math.BigDecimal;

public class Fine {

    private BigDecimal dailyStake;
    private Long days;

    public Fine(BigDecimal dailyStake, Long days) {
        this.dailyStake = dailyStake;
        this.days = days;
    }

    public BigDecimal getAmount(){
        return dailyStake.multiply(BigDecimal.valueOf(days));
    }
}
