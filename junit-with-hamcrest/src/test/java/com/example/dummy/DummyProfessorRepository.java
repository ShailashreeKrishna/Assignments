package com.example.dummy;

import java.util.List;

import com.example.ifaces.ProfessorRepository;
import com.example.model.Professor;

	public class DummyProfessorRepository implements ProfessorRepository{

		@Override
		public String getQualification() {
		
			throw new AssertionError("not yet implemented;");
			}

		@Override
		public Professor findByProfessorId(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int deleteByProfessorId(int id) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Professor add(Professor entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Professor> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		
		
	}


