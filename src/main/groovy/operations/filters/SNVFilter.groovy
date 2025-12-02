package operations

import com.developmentontheedge.be5.groovy.GDynamicPropertySetSupport
import com.developmentontheedge.be5.server.operations.FilterOperation

class SNVFilter extends FilterOperation
{
    @Override
    GDynamicPropertySetSupport getFilterParameters(Map<String, Object> presetValues) throws Exception
    {
        def dps = new GDynamicPropertySetSupport()
        
        dps.gene = [ DISPLAY_NAME: "Gene", TYPE: String ]
        dps.Variant = [ DISPLAY_NAME: "Variant name", TYPE: String ]
        return dps
    }
}
