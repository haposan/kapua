/*******************************************************************************
 * Copyright (c) 2016, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.authentication.credential;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.kapua.model.query.KapuaListResult;

/**
 * Credential list result definition.
 * 
 * @since 1.0
 * 
 */
@XmlRootElement(name = "credentialListResult")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(factoryClass = CredentialXmlRegistry.class, factoryMethod = "newCredentialListResult")
public interface CredentialListResult extends KapuaListResult<Credential> {

}
