DELETE FROM genes;
ALTER SEQUENCE genes_gene_id_seq RESTART WITH 1;

<#macro GENE g>
    INSERT INTO genes(HGNC, name, summary, ensembl_gene_id)
    VALUES( 
        ${g.HGNC?str},
        ${g.name?str},
        <#if g.summary??>${g.summary?str}<#else>NULL</#if>,
        <#if g.ensembl??>${g.ensembl?str}<#else>NULL</#if>);
</#macro>

<@GENE g={
	'HGNC': 'ABCC1', 
	'name': 'ATP binding cassette subfamily C member 1 (ABCC1 blood group)',
    'ensembl': '1234567'
} /> 
