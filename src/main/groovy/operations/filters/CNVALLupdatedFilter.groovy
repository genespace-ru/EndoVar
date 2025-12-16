package operations

import com.developmentontheedge.be5.groovy.GDynamicPropertySetSupport
import com.developmentontheedge.be5.server.operations.FilterOperation

class CNVALLupdatedFilter extends FilterOperation
{
    @Override
    GDynamicPropertySetSupport getFilterParameters(Map<String, Object> presetValues) throws Exception
    {
        def dps = new GDynamicPropertySetSupport()
        
        dps.gene = [ DISPLAY_NAME: "Involved gene", TYPE: String ]
        dps.pat_status  = [ DISPLAY_NAME: "Pathogenicity", TYPE: String,
                     TAG_LIST_ATTR: queries.getTagsFromCustomSelectionView("cnvsall", "PathogenicitySelectionView"),
                     RELOAD_ON_CHANGE: true ]
        dps.Diagnosis = [ DISPLAY_NAME: "Patient diagnosis", TYPE: String ]

        return dps
    }
}
