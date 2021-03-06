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
 *     Red Hat Inc
 *******************************************************************************/
package org.eclipse.kapua.message.xml;

import org.eclipse.kapua.locator.KapuaLocator;
import org.eclipse.kapua.message.KapuaChannel;
import org.eclipse.kapua.message.KapuaMessage;
import org.eclipse.kapua.message.KapuaMessageFactory;
import org.eclipse.kapua.message.KapuaPayload;
import org.eclipse.kapua.message.KapuaPosition;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * Message XML factory class
 */
@XmlRegistry
public class MessageXmlRegistry {

    private static final KapuaLocator LOCATOR = KapuaLocator.getInstance();
    private static final KapuaMessageFactory KAPUA_MESSAGE_FACTORY = LOCATOR.getFactory(KapuaMessageFactory.class);

    public KapuaMessage newKapuaMessage() {
        return KAPUA_MESSAGE_FACTORY.newMessage();
    }

    public KapuaChannel newKapuaChannel() {
        return KAPUA_MESSAGE_FACTORY.newChannel();
    }

    public KapuaPayload newPayload() {
        return KAPUA_MESSAGE_FACTORY.newPayload();
    }

    public KapuaPosition newPosition() {
        return KAPUA_MESSAGE_FACTORY.newPosition();
    }
}
