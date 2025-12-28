package operations

import com.developmentontheedge.be5.groovy.GDynamicPropertySetSupport
import com.developmentontheedge.be5.server.operations.FilterOperation

class GenesFilter extends FilterOperation
{
    @Override
    GDynamicPropertySetSupport getFilterParameters(Map<String, Object> presetValues) throws Exception
    {
        def dps = new GDynamicPropertySetSupport()
        
        dps.HGNC = [ DISPLAY_NAME: "HGNC", TYPE: String ]
        dps.DiagnosisCNVs = [ DISPLAY_NAME: "Patient diagnosis for Search in CNVs", TYPE: String ]
        dps.DiagnosisSNVs = [ DISPLAY_NAME: "Patient diagnosis for Search in SNVs", TYPE: String ]
        return dps
    }
}
