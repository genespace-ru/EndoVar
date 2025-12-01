package operations

import com.developmentontheedge.be5.groovy.GDynamicPropertySetSupport
import com.developmentontheedge.be5.server.operations.FilterOperation

class CNVFilter extends FilterOperation
{
    @Override
    GDynamicPropertySetSupport getFilterParameters(Map<String, Object> presetValues) throws Exception
    {
        def dps = new GDynamicPropertySetSupport()
        
        dps.gene = [ DISPLAY_NAME: "Gene", TYPE: String ]
        dps.chr  = [ DISPLAY_NAME: "Chromosome", TYPE: String,
                     TAG_LIST_ATTR: queries.getTagsFromCustomSelectionView("cnvs", "ChromosomeSelectionView"),
                     RELOAD_ON_CHANGE: true ]

        return dps
    }
}
