/* Automatically generated by GNU msgfmt.  Do not modify!  */
package org.postgresql.translation;
public class messages_ru extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[554];
    t[0] = "";
    t[1] = "Project-Id-Version: JDBC Driver for PostgreSQL 8.x.x\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2016-01-07 15:09+0300\nLast-Translator: Vladimir Sitnikov <sitnikov.vladimir@gmail.com>\nLanguage-Team: pgsql-rus <pgsql-rus@yahoogroups.com>\nLanguage: ru_RU\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nX-Generator: Poedit 1.5.7\n";
    t[4] = "The HostnameVerifier class provided {0} could not be instantiated.";
    t[5] = "Невозможно создать HostnameVerifier с помощью указанного класса {0}";
    t[8] = "Unknown Types value.";
    t[9] = "Неизвестное значение Types.";
    t[12] = "The column name {0} was not found in this ResultSet.";
    t[13] = "Колонки {0} не найдено в этом ResultSet’’е.";
    t[18] = "The array index is out of range: {0}, number of elements: {1}.";
    t[19] = "Индекс массива вне диапазона: {0}. Допустимые значения: 1..{1}";
    t[22] = "Error during one-phase commit. commit xid={0}";
    t[23] = "Ошибка при однофазной фиксации транзакции. commit xid={0}";
    t[26] = "An error occurred while setting up the SSL connection.";
    t[27] = "Ошибка при установке SSL-подсоединения.";
    t[30] = "Failed to create object for: {0}.";
    t[31] = "Ошибка при создании объект для: {0}.";
    t[32] = "Zero bytes may not occur in string parameters.";
    t[33] = "Байт с кодом 0 не может втречаться в строковых параметрах";
    t[34] = "Something unusual has occurred to cause the driver to fail. Please report this exception.";
    t[35] = "Случилось что-то необычное, что заставило драйвер произвести ошибку. Пожалуйста сообщите это исключение.";
    t[38] = "Unsupported Types value: {0}";
    t[39] = "Неподдерживаемый java.sql.Types тип: {0}";
    t[48] = "No IOException expected from StringBuffer or StringBuilder";
    t[49] = "Что-то пошло не так: из классов StringBuffer и StringBuilder исключений не ожидалось";
    t[52] = "The server requested password-based authentication, but no password was provided.";
    t[53] = "Сервер запросил парольную аутентификацию, но пароль не был указан.";
    t[54] = "Position: {0}";
    t[55] = "Позиция: {0}";
    t[60] = "No results were returned by the query.";
    t[61] = "Запрос не вернул результатов.";
    t[66] = "tried to call end without corresponding start call. state={0}, start xid={1}, currentXid={2}, preparedXid={3}";
    t[67] = "Невозможно завершить транзакцию, т.к. транзакция не была начата. state={0}, start xid={1}, currentXid={2}, preparedXid={3}";
    t[70] = "Illegal UTF-8 sequence: {0} bytes used to encode a {1} byte value: {2}";
    t[71] = "Неверная последовательность UTF-8: {0} bytes used to encode a {1} byte value: {2}";
    t[76] = "Unexpected command status: {0}.";
    t[77] = "Неожиданный статус команды: {0}.";
    t[82] = "Interval {0} not yet implemented";
    t[83] = "Интеврвал {0} ещё не реализован";
    t[84] = "Unsupported property name: {0}";
    t[85] = "Свойство {0} не поддерживается";
    t[90] = "A connection could not be made using the requested protocol {0}.";
    t[91] = "Невозможно установить соединение с помощью протокола {0}";
    t[92] = "The authentication type {0} is not supported. Check that you have configured the pg_hba.conf file to include the client''s IP address or subnet, and that it is using an authentication scheme supported by the driver.";
    t[93] = "Тип аутентификации {0} не поддерживается. Проверьте если вы сконфигурировали файл pg_hba.conf чтобы включить IP-адреса клиентов или подсеть. Также удостовертесь что он использует схему аутентификации поддерживаемую драйвером.";
    t[96] = "Protocol error.  Session setup failed.";
    t[97] = "Ошибка протокола.  Установление сессии не удалось.";
    t[100] = "The password callback class provided {0} could not be instantiated.";
    t[101] = "Невозможно создать password callback с помощью указанного класса {0}";
    t[104] = "suspend/resume not implemented";
    t[105] = "Операции XA suspend/resume не реализованы";
    t[116] = "Fastpath call {0} - No result was returned and we expected a long.";
    t[117] = "Вызов fastpath {0} ничего не вернул, а ожидалось long";
    t[130] = "Transaction isolation level {0} not supported.";
    t[131] = "Уровень изоляции транзакций {0} не поддерживается.";
    t[132] = "Large Objects may not be used in auto-commit mode.";
    t[133] = "Большие объекты не могут использоваться в режиме авто-подтверждения (auto-commit).";
    t[134] = "The driver currently does not support COPY operations.";
    t[135] = "Драйвер в данный момент не поддерживате операции COPY.";
    t[136] = "Malformed function or procedure escape syntax at offset {0}.";
    t[137] = "Невозможно разобрать SQL команду. Ошибка на позиции {0}";
    t[138] = "Zero bytes may not occur in identifiers.";
    t[139] = "Символ с кодом 0 в идентификаторах не допустим";
    t[140] = "The array index is out of range: {0}";
    t[141] = "Индекс массива вне диапазона: {0}";
    t[142] = "This SQLXML object has already been freed.";
    t[143] = "Этот объект SQLXML уже был закрыт";
    t[146] = "Unexpected copydata from server for {0}";
    t[147] = "Неожиданный статус команды COPY: {0}";
    t[148] = "Connection has been closed.";
    t[149] = "Это соединение уже было закрыто";
    t[150] = "Not implemented: 2nd phase commit must be issued using an idle connection. commit xid={0}, currentXid={1}, state={2}, transactionState={3}";
    t[151] = "Духфазная фиксация работает только, если соединение неактивно (state=idle и транзакцция отсутствует). commit xid={0}, currentXid={1}, state={2}, transactionState={3}";
    t[160] = "The SSLSocketFactory class provided {0} could not be instantiated.";
    t[161] = "Невозможно создать SSLSocketFactory с помощью указанного класса {0}";
    t[164] = "The SocketFactory class provided {0} could not be instantiated.";
    t[165] = "Невозможно создать SSLSocketFactory с помощью указанного класса {0}";
    t[166] = "An I/O error occurred while sending to the backend.";
    t[167] = "Ошибка ввода/ввывода при отправке бэкенду";
    t[184] = "An error occurred reading the certificate";
    t[185] = "Ошибка при чтении сертификата";
    t[196] = "commit called before end. commit xid={0}, state={1}";
    t[197] = "Операция commit должна вызываться только после операции end. commit xid={0}, state={1}";
    t[200] = "Finalizing a Connection that was never closed:";
    t[201] = "Соединение «утекло». Проверьте, что в коде приложения вызывается connection.close(). Далее следует стектрейс того места, где создавалось проблемное соединение";
    t[202] = "Illegal UTF-8 sequence: final value is a surrogate value: {0}";
    t[203] = "Неверная последовательность UTF-8: финальное значение является surrogate значением: {0}";
    t[210] = "Unknown Response Type {0}.";
    t[211] = "Неизвестный тип ответа {0}.";
    t[214] = "Expected an EOF from server, got: {0}";
    t[215] = "Неожиданный ответ от сервера. Ожидалось окончание потока, получен байт {0}";
    t[220] = "Invalid sslmode value: {0}";
    t[221] = "Неверное значение sslmode: {0}";
    t[222] = "Failed to initialize LargeObject API";
    t[223] = "Ошибка при инициализации LargeObject API";
    t[226] = "Connection attempt timed out.";
    t[227] = "Закончилось время ожидания";
    t[232] = "An unexpected result was returned by a query.";
    t[233] = "Запрос вернул неожиданный результат.";
    t[236] = "Error committing prepared transaction. commit xid={0}, preparedXid={1}, currentXid={2}";
    t[237] = "Ошибка при фиксации подготовленной транзакции. commit xid={0}, preparedXid={1}, currentXid={2}";
    t[242] = "Unknown type {0}.";
    t[243] = "Неизвестный тип {0}.";
    t[250] = "Interrupted while waiting to obtain lock on database connection";
    t[251] = "Ожидание COPY блокировки прервано получением interrupt";
    t[262] = "Invalid targetServerType value: {0}";
    t[263] = "Неверное значение targetServerType: {0}";
    t[270] = "A result was returned when none was expected.";
    t[271] = "Результат возвращён когда его не ожидалось.";
    t[272] = "Detail: {0}";
    t[273] = "Подробности: {0}";
    t[276] = "The column index is out of range: {0}, number of columns: {1}.";
    t[277] = "Индекс колонки вне диапазона: {0}. Допустимые значения: 1..{1}";
    t[284] = "This ResultSet is closed.";
    t[285] = "ResultSet закрыт.";
    t[298] = "Requested CopyIn but got {0}";
    t[299] = "Ожидался ответ CopyIn, а получен {0}";
    t[302] = "Conversion to type {0} failed: {1}.";
    t[303] = "Ошибка при преобразовании к типу {0}: {1}";
    t[306] = "Not implemented: Prepare must be issued using the same connection that started the transaction. currentXid={0}, prepare xid={1}";
    t[307] = "В каком соединении транзакцию начинали, в таком и вызывайте prepare. По-другому не работает. currentXid={0}, prepare xid={1}";
    t[308] = "Server SQLState: {0}";
    t[309] = "SQLState сервера: {0}";
    t[314] = "Connection to {0} refused. Check that the hostname and port are correct and that the postmaster is accepting TCP/IP connections.";
    t[315] = "Подсоединение по адресу {0} отклонено. Проверьте что хост и порт указаны правильно и что postmaster принимает TCP/IP-подсоединения.";
    t[318] = "Invalid flags {0}";
    t[319] = "Неверные флаги {0}";
    t[326] = "Statement has been closed.";
    t[327] = "Statement закрыт.";
    t[328] = "Too many update results were returned.";
    t[329] = "Возвращено слишком много результатов обновления.";
    t[330] = "The connection attempt failed.";
    t[331] = "Ошибка при попытке подсоединения.";
    t[342] = "Location: File: {0}, Routine: {1}, Line: {2}";
    t[343] = "Местонахождение: Файл {0}, Процедура: {1}, Строка: {2}";
    t[344] = "Expected command status BEGIN, got {0}.";
    t[345] = "Ожидался статус команды BEGIN, но получен {0}";
    t[346] = "There are no rows in this ResultSet.";
    t[347] = "Невозможно удалить строку, т.к. в текущем ResultSet’е строк вообще нет";
    t[350] = "Where: {0}";
    t[351] = "Где: {0}";
    t[356] = "Failed to set ClientInfo property: {0}";
    t[357] = "Невозможно установить свойство ClientInfo: {0}";
    t[358] = "Conversion of money failed.";
    t[359] = "Ошибка при преобразовании типа money.";
    t[366] = "Error preparing transaction. prepare xid={0}";
    t[367] = "Ошибка при выполнении prepare для транзакции {0}";
    t[368] = "Invalid timeout ({0}<0).";
    t[369] = "Значение таймаута должно быть неотрицательным: {0}";
    t[374] = "Unsupported value for stringtype parameter: {0}";
    t[375] = "Неподдерживаемое значение для параметра stringtype: {0}";
    t[380] = "Requested CopyOut but got {0}";
    t[381] = "Ожидался ответ CopyOut, а получен {0}";
    t[382] = "This PooledConnection has already been closed.";
    t[383] = "Это соединение уже было закрыто";
    t[392] = "Could not find a server with specified targetServerType: {0}";
    t[393] = "Не удалось найти сервер с указанным значением targetServerType: {0}";
    t[402] = "Interrupted while attempting to connect.";
    t[403] = "Подключение прервано получаением interrupt";
    t[406] = "The parameter index is out of range: {0}, number of parameters: {1}.";
    t[407] = "Индекс параметра вне диапазона: {0}. Допустимые значения: 1..{1}";
    t[410] = "Unable to bind parameter values for statement.";
    t[411] = "Не в состоянии ассоциировать значения параметров для команды (PGBindException)";
    t[420] = "Cannot write to copy a byte of value {0}";
    t[421] = "Значение byte должно быть в диапазоне 0..255, переданное значение: {0}";
    t[422] = "Ran out of memory retrieving query results.";
    t[423] = "Недостаточно памяти для обработки результатов запроса. Попробуйте увеличить -Xmx или проверьте размеры обрабатываемых данных";
    t[434] = "Prepare called before end. prepare xid={0}, state={1}";
    t[435] = "Вызов prepare должен происходить только после вызова end. prepare xid={0}, state={1}";
    t[436] = "Hint: {0}";
    t[437] = "Подсказка: {0}";
    t[444] = "This copy stream is closed.";
    t[445] = "Поток уже был закрыт";
    t[450] = "The server does not support SSL.";
    t[451] = "Сервер не поддерживает SSL.";
    t[454] = "Conversion of interval failed";
    t[455] = "Невозможно обработать PGInterval: {0}";
    t[464] = "No value specified for parameter {0}.";
    t[465] = "Не указано значение для параметра {0}.";
    t[466] = "Invalid stream length {0}.";
    t[467] = "Неверная длина потока {0}.";
    t[472] = "Unsupported properties: {0}";
    t[473] = "Указанные свойства не поддерживаются: {0}";
    t[474] = "Invalid character data was found.  This is most likely caused by stored data containing characters that are invalid for the character set the database was created in.  The most common example of this is storing 8bit data in a SQL_ASCII database.";
    t[475] = "Найдены неверные символьные данные.  Причиной этого скорее всего являются хранимые данные содержащие символы не соответствующие набору символов базы.  Типичным примером этого является хранение 8-битных данных в базе SQL_ASCII.";
    t[476] = "Copying from database failed: {0}";
    t[477] = "Ошибка при обработке ответа команды COPY: {0}";
    t[480] = "This statement has been closed.";
    t[481] = "Этот Sstatement был закрыт.";
    t[484] = "oid type {0} not known and not a number";
    t[485] = "Oid {0} не известен или не является числом";
    t[490] = "Illegal UTF-8 sequence: byte {0} of {1} byte sequence is not 10xxxxxx: {2}";
    t[491] = "Неверная последовательность UTF-8: байт {0} из {1} не подходит к маске 10xxxxxx: {2}";
    t[494] = "Invalid protocol state requested. Attempted transaction interleaving is not supported. xid={0}, currentXid={1}, state={2}, flags={3}";
    t[495] = "Чередование транзакций в одном соединении не поддерживается. Предыдущую транзакцию нужно завершить xid={0}, currentXid={1}, state={2}, flags={3}";
    t[506] = "Method {0} is not yet implemented.";
    t[507] = "Метод {0} ещё не реализован";
    t[514] = "DataSource has been closed.";
    t[515] = "DataSource закрыт.";
    t[518] = "Illegal UTF-8 sequence: final value is out of range: {0}";
    t[519] = "Неверная последовательность UTF-8: финальное значение вне области допустимых: {0}";
    t[520] = "Error rolling back prepared transaction. rollback xid={0}, preparedXid={1}, currentXid={2}";
    t[521] = "Ошибка при откате подготовленной транзакции. rollback xid={0}, preparedXid={1}, currentXid={2}";
    t[522] = "Unable to create SAXResult for SQLXML.";
    t[523] = "Невозможно создать SAXResult для SQLXML";
    t[530] = "This connection has been closed.";
    t[531] = "Соединение уже было закрыто";
    t[538] = "Illegal UTF-8 sequence: initial byte is {0}: {1}";
    t[539] = "Неверная последовательность UTF-8: начальное значеие {0}: {1}";
    t[544] = "Premature end of input stream, expected {0} bytes, but only read {1}.";
    t[545] = "Раннее завершение входного потока, ожидалось байт: {0}, но считано только {1}";
    t[550] = "Unsupported binary encoding of {0}.";
    t[551] = "Бинарная передача не поддерживается для типа  {0}";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 277) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 275) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 554)
        idx -= 554;
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 554 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 554);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 554 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
