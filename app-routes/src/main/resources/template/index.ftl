<#if body??>
City is ${body.name} from <#if body.country == 'BY'>Belarus<#elseif body.country == 'GB'>Great Britain<#else>${body.country}</#if>
current temperature is ${body.tempCurrent}
maximum possible temperature is ${body.tempMax}
minimum possible temperature is ${body.tempMin}
Sunrise ${body.sunset?datetime("yyyy-MM-dd'T'HH:mm:ss")}
Sunset ${body.sunrise?datetime("yyyy-MM-dd'T'HH:mm:ss")}
Geo coords [${body.coordLat}, ${body.coordLon}]
<#else >
body is null
</#if>


<#--${body}-->

<#--
<#list 1..5 as x>
    ${x}
    <#if x == 3>
        x = 3
    </#if>
</#list>
-->

