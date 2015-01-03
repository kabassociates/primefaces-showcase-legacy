/*
 * Copyright 2009-2014 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.showcase.view.data.diagram;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.diagram.DefaultDiagramModel;
import org.primefaces.model.diagram.DiagramModel;
import org.primefaces.model.diagram.Element;
import org.primefaces.model.diagram.ElementConnection;
import org.primefaces.model.diagram.connector.StraightConnector;
import org.primefaces.model.diagram.endpoint.EndPointAnchor;
import org.primefaces.model.diagram.endpoint.RectangleEndPoint;

@ManagedBean(name = "diagramHierarchicalView")
@RequestScoped
public class HierarchicalView {
    
    private DiagramModel model;

    @PostConstruct
    public void init() {
        model = new DefaultDiagramModel();
        
        Element ceo = new Element("CEO", "25em", "6em");
        ceo.addEndPoint(new RectangleEndPoint(EndPointAnchor.BOTTOM));
        model.addElement(ceo);
        
        //CFO
        Element cfo = new Element("CFO", "10em", "18em");
        cfo.addEndPoint(new RectangleEndPoint(EndPointAnchor.TOP));
        cfo.addEndPoint(new RectangleEndPoint(EndPointAnchor.BOTTOM));
        
        Element fin = new Element("FIN", "5em", "30em");
        fin.addEndPoint(new RectangleEndPoint(EndPointAnchor.TOP));
        
        Element pur = new Element("PUR", "20em", "30em");
        pur.addEndPoint(new RectangleEndPoint(EndPointAnchor.TOP));
        
        model.addElement(cfo);
        model.addElement(fin);
        model.addElement(pur);
        
        //CTO
        Element cto = new Element("CTO", "40em", "18em");
        cto.addEndPoint(new RectangleEndPoint(EndPointAnchor.TOP));
        cto.addEndPoint(new RectangleEndPoint(EndPointAnchor.BOTTOM));
        
        Element dev = new Element("DEV", "35em", "30em");
        dev.addEndPoint(new RectangleEndPoint(EndPointAnchor.TOP));
        
        Element tst = new Element("TST", "50em", "30em");
        tst.addEndPoint(new RectangleEndPoint(EndPointAnchor.TOP));
        
        model.addElement(cto);
        model.addElement(dev);
        model.addElement(tst);
                        
        //connections
        model.connect(new ElementConnection(ceo.getEndPoints().get(0), cfo.getEndPoints().get(0), new StraightConnector()));        
        model.connect(new ElementConnection(ceo.getEndPoints().get(0), cto.getEndPoints().get(0), new StraightConnector()));
        model.connect(new ElementConnection(cfo.getEndPoints().get(1), fin.getEndPoints().get(0), new StraightConnector()));
        model.connect(new ElementConnection(cfo.getEndPoints().get(1), pur.getEndPoints().get(0), new StraightConnector()));
        model.connect(new ElementConnection(cto.getEndPoints().get(1), dev.getEndPoints().get(0), new StraightConnector()));
        model.connect(new ElementConnection(cto.getEndPoints().get(1), tst.getEndPoints().get(0), new StraightConnector()));
    }
    
    public DiagramModel getModel() {
        return model;
    }
}