import React, {Component} from 'react';
import {registerTableBox, processHashUrl, Navs} from 'be5-react';
import {Field, FieldNotEmpty} from './utils';

class GeneInfoTableBox extends Component
{
  render()
  {
    const info = this.props.value.data.attributes.rows[0];

    return (
        <div className="geneInfo">
            <Field  title='Имя'                         value={info.name.value}/>
       </div>);
  }
}

registerTableBox('geneInfo', GeneInfoTableBox);
export default GeneInfoTableBox;
