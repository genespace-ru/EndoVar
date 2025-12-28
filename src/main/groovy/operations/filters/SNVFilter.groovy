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
        dps.Variant = [ DISPLAY_NAME: "Variant", TYPE: String ]
        dps.pa  = [ DISPLAY_NAME: "Pathogenicity", TYPE: String,
                     TAG_LIST_ATTR: queries.getTagsFromCustomSelectionView("snvspats", "PathogenicitySelectionView"),
                     RELOAD_ON_CHANGE: true ]    
        dps.Diagnosis = [ DISPLAY_NAME: "Patient diagnosis", TYPE: String ]                                                     
        return dps
    }
}
