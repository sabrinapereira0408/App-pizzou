package br.com.sg2l2.pizzou;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CardapioDAO_Impl implements CardapioDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Cardapio> __insertionAdapterOfCardapio;

  private final EntityDeletionOrUpdateAdapter<Cardapio> __deletionAdapterOfCardapio;

  public CardapioDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCardapio = new EntityInsertionAdapter<Cardapio>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `cardapio` (`id`,`nome`,`foto`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Cardapio value) {
        stmt.bindLong(1, value.getId());
        if (value.getNome() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNome());
        }
        if (value.getFoto() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFoto());
        }
      }
    };
    this.__deletionAdapterOfCardapio = new EntityDeletionOrUpdateAdapter<Cardapio>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `cardapio` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Cardapio value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(final Cardapio cardapio) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCardapio.insert(cardapio);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Cardapio cardapio) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCardapio.handle(cardapio);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Cardapio getById(final long id) {
    final String _sql = "SELECT * FROM cardapio where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
      final int _cursorIndexOfFoto = CursorUtil.getColumnIndexOrThrow(_cursor, "foto");
      final Cardapio _result;
      if(_cursor.moveToFirst()) {
        _result = new Cardapio();
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpNome;
        _tmpNome = _cursor.getString(_cursorIndexOfNome);
        _result.setNome(_tmpNome);
        final String _tmpFoto;
        _tmpFoto = _cursor.getString(_cursorIndexOfFoto);
        _result.setFoto(_tmpFoto);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Cardapio> findAll() {
    final String _sql = "SELECT * FROM cardapio";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
      final int _cursorIndexOfFoto = CursorUtil.getColumnIndexOrThrow(_cursor, "foto");
      final List<Cardapio> _result = new ArrayList<Cardapio>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Cardapio _item;
        _item = new Cardapio();
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpNome;
        _tmpNome = _cursor.getString(_cursorIndexOfNome);
        _item.setNome(_tmpNome);
        final String _tmpFoto;
        _tmpFoto = _cursor.getString(_cursorIndexOfFoto);
        _item.setFoto(_tmpFoto);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
