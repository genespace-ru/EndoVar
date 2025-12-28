package operations

import com.developmentontheedge.be5.groovy.GDynamicPropertySetSupport
import com.developmentontheedge.be5.server.operations.FilterOperation

class ICD10Filter extends FilterOperation
{
    @Override
    GDynamicPropertySetSupport getFilterParameters(Map<String, Object> presetValues) throws Exception
    {
        def dps = new GDynamicPropertySetSupport()
        
        dps.ICD10Code = [ DISPLAY_NAME: "ICD10 Code", TYPE: String ]
        dps.Diagnosis = [ DISPLAY_NAME: "Diagnosis", TYPE: String ]
        return dps
    }
}
