/*
 * $Header: /home/cvs/jakarta-struts/src/example/org/apache/struts/webapp/example/UserDatabase.java,v 1.2 2003/09/04 16:03:42 husted Exp $
 * $Revision: 1.2 $
 * $Date: 2003/09/04 16:03:42 $
 *
 * ====================================================================
 *
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 1999-2002 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "The Jakarta Project", "Struts", and "Apache Software
 *    Foundation" must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */


package org.apache.struts.webapp.example;


/**
 * <p>A <strong>Data Access Object</strong> (DAO) interface describing
 * the available operations for retrieving and storing {@link User}s
 * (and their associated {@link Subscription}s) in some persistence layer
 * whose characteristics are not specified here.  One or more implementations
 * will be created to perform the actual I/O that is required.</p>
 *
 * @author Craig R. McClanahan
 * @version $Revision: 1.2 $ $Date: 2003/09/04 16:03:42 $
 * @since Struts 1.1
 */

public interface UserDatabase {


    // --------------------------------------------------------- Public Methods


    /**
     * <p>Create and return a new {@link User} defined in this user database.
     * </p>
     *
     * @param username Username of the new user
     *
     * @exception IllegalArgumentException if the specified username
     *  is not unique
     */
    public User createUser(String username);


    /**
     * <p>Finalize access to the underlying persistence layer.</p>
     *
     * @exception Exception if a database access error occurs
     */
    public void close() throws Exception;


    /**
     * <p>Return the existing {@link User} with the specified username,
     * if any; otherwise return <code>null</code>.</p>
     *
     * @param username Username of the user to retrieve
     */
    public User findUser(String username);


    /**
     * <p>Return the set of {@link User}s defined in this user database.</p>
     */
    public User[] findUsers();


    /**
     * <p>Initiate access to the underlying persistence layer.</p>
     *
     * @exception Exception if a database access error occurs
     */
    public void open() throws Exception;


    /**
     * Remove the specified {@link User} from this database.
     *
     * @param user User to be removed
     *
     * @exception IllegalArgumentException if the specified user is not
     *  associated with this database
     */
    public void removeUser(User user);


    /**
     * <p>Save any pending changes to the underlying persistence layer.</p>
     *
     * @exception Exception if a database access error occurs
     */
    public void save() throws Exception;


}
