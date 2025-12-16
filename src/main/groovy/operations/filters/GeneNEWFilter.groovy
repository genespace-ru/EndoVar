package operations

import com.developmentontheedge.be5.groovy.GDynamicPropertySetSupport
import com.developmentontheedge.be5.server.operations.FilterOperation

class GeneNEWFilter extends FilterOperation
{
    @Override
    GDynamicPropertySetSupport getFilterParameters(Map<String, Object> presetValues) throws Exception
    {
        def dps = new GDynamicPropertySetSupport()
        
        dps.HGNC = [ DISPLAY_NAME: "HGNC", TYPE: String ]
        dps.Diagnosis = [ DISPLAY_NAME: "Patient diagnosis", TYPE: String ]
        return dps
    }
}
