import React, {Component} from 'react';
import {registerTableBox, processHashUrl, Navs} from 'be5-react';

class CNVTableBox extends Component
{
  componentDidMount()
  {
  }
  
  render()
  {
    const cnv = this.props.value.data.attributes.rows[0];

    //this.title = cnv.Title.value;
    //be5.ui.setTitle(this.title);

    const tableRef = '#!table/';
  	const steps = [
		{title: "Общая информация", url: tableRef + 'cnvs/Info/ID='               + cnv.ID.value}

  	];

  	return (
      	<div className="cnvInfo">

    	  <h1>{this.title}</h1>

      	<Navs steps={steps} tabs startAtStep={0} />
      	</div>
    );
  }
}

registerTableBox('cnv', CNVTableBox);