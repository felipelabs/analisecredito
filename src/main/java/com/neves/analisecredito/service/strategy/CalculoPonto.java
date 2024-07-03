package com.neves.analisecredito.service.strategy;

import com.neves.analisecredito.domain.Proposta;

public interface CalculoPonto {

    int calcular(Proposta proposta);
}
