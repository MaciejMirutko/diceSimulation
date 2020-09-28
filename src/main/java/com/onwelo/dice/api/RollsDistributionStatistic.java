package com.onwelo.dice.api;

import com.onwelo.dice.domain.RolesSession;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RollsDistributionStatistic {

    private final Map<Integer, BigDecimal> statistic;

    public RollsDistributionStatistic(RolesSession rolesResults) {
        this.statistic = new LinkedHashMap<>();
        rolesResults.getNumberDistribution().keySet()
                .forEach(key -> statistic.put(key, BigDecimal.ZERO));
    }
}
