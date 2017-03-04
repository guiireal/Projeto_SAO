Imports System.Math

Module Module1

    'declaração das variáveis e constantes

    Public Const Pi = 3.14159

    'Public d As Double = 37.8  'diametro
    'Public lf As Double = 552.46  'percurso de avanço
    'Public K As Double = 50200000000 'constante material 
    'Public X As Double = 4.1557    'coeficiente taylor
    'Public MC As Double = 0.5    'margem contribuição = % =
    'Public Taxas As Double = 0.3465  'taxas = % 
    'Public SH As Double = 15    'salário homem 
    'Public Cm As Double = 4.34    'custo material 
    'Public Kft As Double = 3.28   'custo da aresta 
    'Public Tft As Double = 0.58    'tempo troca ferra 
    'Public Ctu As Double = 2.05    'custos tempos passivos 
    'Public SM As Double = 40     'salario maquina 

    Public Structure Estado
        'variaveis de acordo com a entrada
        Public Sh As Double    ' salario homem
        Public Cm As Double    ' custo do material
        Public Kft As Double   ' custo de cada aresta
        Public Tft As Double   ' tempo de troca da ferramenta
        Public Ctu As Double   ' custos tempos passivos
        Public Sm As Double    ' salário maquina

        'parametros para ACOr
        ' Public FO As Double         'funcao objetivo - KpVcmc
        Public pesoW As Double      'peso de cada solucao
        Public probabilidade As Double  'probabilidade de cada solucao

        'obtidos - calculados
        Public Vcmc As Double  ' velocidade de minimo custo
        Public VcmcLim As Double
        Public VcmXp As Double

        'obtidos - calculados
        Public KpVcmc, KpVcmcLim, KpVcmXp As Double
        Public TpVcmc, TpVcmcLim, TpVcmXp As Double

    End Structure

    Public stInicial, stAtual(K), stMelhor, stSucessor As Estado
    Public formiga(m) As Estado


    Public Structure Percentagem
        'variaveis de acordo com a porcentagem
        Public Sh As Double    ' salario homem
        Public Cm As Double    ' custo do material
        Public Kft As Double   ' custo de cada aresta
        Public Tft As Double   ' tempo de troca da ferramenta
        Public Ctu As Double   ' custos tempos passivos
        Public Sm As Double    ' salário maquina
    End Structure

    Public stPercParametros As Percentagem

    Public Structure minimoPermitido
        'variaveis de acordo com a entrada
        Public Sh As Double   ' salario homem
        Public Cm As Double    ' custo do material
        Public Kft As Double   ' custo de cada aresta
        Public Tft As Double   ' tempo de troca da ferramenta
        Public Ctu As Double   ' custos tempos passivos
        Public Sm As Double    ' salário maquina
    End Structure

    Public stMinimoPermitodo As minimoPermitido

    Public Structure Fixos
        'fixos
        Public d As Double     ' diametro da peça
        Public lf As Double    ' percuros de avanço
        Public f As Double     ' avanço
        Public k As Double     ' constante do material
        Public x As Double     ' coeficiente de Taylor
        'fixos
        Public mc As Double    ' margem de contribuição
        Public tx As Double    ' taxas

    End Structure

    Public stFixo As Fixos


    Public Function calculaVcmc(ByVal K As Double, ByVal SH As Double, ByVal SM As Double, ByVal x As Double,
                                ByVal Kft As Double, ByVal Tft As Double) As Double
        Dim Vcmc As Double

        Vcmc = ((K * (SH + SM)) / (60 * (x - 1) * (Kft + ((SH + SM) / 60) * Tft))) ^ (1 / x)

        Return Vcmc

    End Function

    Public Function calculaVcmcLim(ByVal K As Double, ByVal SH As Double, ByVal SM As Double, ByVal x As Double,
                                   ByVal Kft As Double) As Double
        Dim VcmcLim As Double

        VcmcLim = ((K * (SH + SM)) / (60 * (x - 1) * (Kft))) ^ (1 / x)

        Return VcmcLim

    End Function

    Public Function calculaVcmXp(ByVal K As Double, ByVal x As Double,
                                 ByVal Tft As Double) As Double
        Dim VcmXp As Double

        VcmXp = (K / ((x - 1) * Tft)) ^ (1 / x)

        Return VcmXp

    End Function


    Public Function calculaTempoCorte(ByVal lf As Double, ByVal d As Double,
                                 ByVal f As Double, ByVal Vc As Double) As Double
        Dim tc As Double

        tc = (lf * Pi * d) / (1000 * f * Vc)

        Return tc
    End Function


    Public Function calculaVidaFerramenta(ByVal K As Double, ByVal Vc As Double, ByVal x As Double) As Double
        Dim Vida As Double

        Vida = K * Vc ^ (-x)

        Return Vida
    End Function

    'função que quero minimizar

    Public Function calculaCustoTotalKp(ByVal sh As Double, ByVal cm As Double, ByVal kft As Double,
                                        ByVal tft As Double, ByVal ctu As Double, ByVal sm As Double,
                                        ByVal Vc As Double) As Double


        Dim Kp As Double
        Dim tc, Vida As Double

        tc = calculaTempoCorte(stFixo.lf, stFixo.d, stFixo.f, Vc)

        Vida = calculaVidaFerramenta(stFixo.k, Vc, stFixo.x)

        Kp = (ctu + cm) + (tc / 60 * (sh + sm)) + ((tc / Vida) * (kft + tft / 60 * (sh + sm)))

        Return Kp

    End Function

    Public Function calculaPrecoVendaTp(ByVal kp As Double, ByVal mc As Double, ByVal tx As Double) As Double
        Dim Tp As Double
        Tp = kp / ((1 - mc / 100) * (1 - tx / 100))

        Return Tp

    End Function

    Public Function variacaoParametro(ByVal parametro As Double, ByVal porcentagem As Double) As Double

        Dim valorMinimo, valorMaximo As Double

        valorMinimo = parametro * (1 - (porcentagem / 100))

        valorMaximo = parametro * (1 + (porcentagem / 100))

        'escolher o parametro aleatoriamente dentro do intervalor 

        Return 0
    End Function

End Module
