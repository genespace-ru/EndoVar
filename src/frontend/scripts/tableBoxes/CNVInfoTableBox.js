import React, {Component} from 'react';
import {registerTableBox, processHashUrl, Navs} from 'be5-react';
import {Field, FieldNotEmpty} from './utils';

class CNVInfoTableBox extends Component
{
  render()
  {
    const info = this.props.value.data.attributes.rows[0];

    return (
        <div className="cnvInfo">
            <Field  title='Ген'                          value={info.gene.value}/>
            <Field  title='Тип CNV'                          value={info.status.value}/>
            <Field  title='Координаты CNV'                          value={info.P.value}/>
            <Field  title='Патогенность'                          value={info.Pathogenicity.value}/>
            <Field  title='Обнаружен у пациента с диагнозом'                          value={info.I.value}/>
            <Field  title='Обнаружен впервые/описан в ClinVar'                          value={info.Ne.value}/>
       </div>);
  }
}

registerTableBox('cnvInfo', CNVInfoTableBox);
export default CNVInfoTableBox;