import React, {Component} from 'react';
import {registerTableBox, processHashUrl, Navs} from 'be5-react';

class GeneTableBox extends Component
{
  componentDidMount()
  {
  }
  
  render()
  {
    const gene = this.props.value.data.attributes.rows[0];

    //this.title = gene.Title.value;
    //be5.ui.setTitle(this.title);

    const tableRef = '#!table/';
  	const steps = [
		{title: "Общая информация", url: tableRef + 'genes/Info/ID='               + gene.ID.value},

  	];

  	return (
      	<div className="geneInfo">

    	  <h1>{this.title}</h1>

      	<Navs steps={steps} tabs startAtStep={0} />
      	</div>
    );
  }
}

registerTableBox('gene', GeneTableBox);